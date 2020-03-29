package services;

import models.Recipient;
import models.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.RequestRepository;

import java.util.*;


@Service
public
class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request createRequest (Request request){
        Request newRequest = new Request();
        newRequest.setDatePosted(request.getDatePosted());
        newRequest.setTypeOfRequest(request.getTypeOfRequest());
        newRequest.setRequestDescription(request.getRequestDescription());
        newRequest.setRecipient(request.getRecipient());
        return requestRepository.save(request);
    }

    public List<Request> displayAllRequestsByDatePosted(){
        Iterable <Request> requests = requestRepository.findAll();
        List<Request> cltnRequests = new ArrayList<>();
        for(Request r : requests){
            cltnRequests.add(r);
        }
         cltnRequests.sort(Comparator.comparing(Request::getDatePosted));
        return cltnRequests;
    }

    public Boolean deleteRequest(Long id){
        if(requestRepository.findById(id).isPresent()){
            requestRepository.deleteById(id);
            return true;
        }
        else return false;
    }
    
    
}
