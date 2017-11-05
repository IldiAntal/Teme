package ro.sci.service;

import ro.sci.domain.Cauciuc;


public class CauciucService {

    private Cauciuc[] cauciucs;

    public CauciucService() {initLocalCauciucs();}

    public Cauciuc findCauciuc(String numeCauciuc){
        Cauciuc foundCauciuc = null;
        for(Cauciuc cauciuc: cauciucs) {
            if (numeCauciuc != null && numeCauciuc.equals(cauciuc.numeCauciuc)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;

    }


    private void initLocalCauciucs() {

    Cauciuc c1 = new Cauciuc("Kelly");
    c1.sezon = "Toate";
    c1.inaltime = 80;
    c1.latime = 155;
    c1.raza = 13;

    Cauciuc c2 = new Cauciuc("Tiger");
    c2.sezon = "Vara";
    c2.inaltime = 65;
    c2.latime = 155;
    c2.raza = 13;

    Cauciuc c3 = new Cauciuc("Debica");
    c3.sezon = "Irarna";
    c3.inaltime = 70;
    c3.latime = 155;
    c3.raza = 13;


    }
}
