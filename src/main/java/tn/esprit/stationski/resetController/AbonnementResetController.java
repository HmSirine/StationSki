package tn.esprit.stationski.resetController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.stationski.Services.IAbonnement;
import tn.esprit.stationski.entities.Abonnement;

@RestController
public class AbonnementResetController {

    @Autowired
    public IAbonnement iAbonnement;

    public Abonnement addAbonnement(Abonnement abonnement){
        return iAbonnement.addAbonnement(abonnement);
    }




}
