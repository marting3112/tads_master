package co.edu.umanizales.tads.service;

import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {
        kids = new ListSE();
        kids.add(new Kid("123","Carlos",(byte)4));
        kids.add(new Kid("256","Mariana",(byte)3));
        kids.add(new Kid("789","Daniel",(byte)5));

        kids.addToStart(new Kid("967","Estefania",(byte)6));
        kids.addByPosition(new Kid("567","Martín",(byte) 4),2);
        kids.deleteByidentification("256");

    }
    public Node getKids()
    {
        return kids.getHead();
    }


}
