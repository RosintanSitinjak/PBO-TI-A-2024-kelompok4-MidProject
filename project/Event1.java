package project;


import java.util.ArrayList;

import static project.Peserta.pesertaList;

public class Event1{
    String nameEvent;
    String dateEvent;
    String eventLocation;


public Event1(String nameEvent, String dateEvent, String eventLocation){
    this.nameEvent = nameEvent;
    this.dateEvent = dateEvent;
    this.eventLocation = eventLocation;
}


    public String getnameEvent() {
        return nameEvent;
    }
    public void tambahPeserta(Peserta.PesertaInfo peserta){
        pesertaList.add(peserta);
    }
    public ArrayList<Peserta.PesertaInfo> getPesertaList() {
        return pesertaList;
    }
}



