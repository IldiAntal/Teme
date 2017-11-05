package ro.sci.controller;


import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;
import ro.sci.service.SearchService;

public class CauciucController {
    private SearchService searchService = new SearchService();

    public Cauciuc handleSearchRequest(SearchRequest searchRequest){
        Cauciuc cauciuc = this.searchService.search(searchRequest);
        return cauciuc;
    }

}
