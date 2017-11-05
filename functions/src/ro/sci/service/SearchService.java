package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;


public class SearchService {

    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchRequest searchRequest) {
        Cauciuc searchItem = null;

        if(searchRequest != null) {
            searchItem = this.cauciucService.findCauciuc(searchRequest.numeCauciuc);
        }

        return searchItem;

    }



}
