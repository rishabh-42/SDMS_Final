package com.scgj.SDMS.Models;

import javax.persistence.*;

@Entity
@Table(name = "training_partner")
public class TrainingPartner {
    public TrainingPartner() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainer_partner_id")
    private int trainerPartnerId;

    @Column(name = "training_partner_name")
    private String trainingPartnerName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application_id")
    private Application application;

    public int getTrainerPartnerId() {
        return trainerPartnerId;
    }

    public void setTrainerPartnerId(int trainerPartnerId) {
        this.trainerPartnerId = trainerPartnerId;
    }

    public String getTrainingPartnerName() {
        return trainingPartnerName;
    }

    public void setTrainingPartnerName(String trainingPartnerName) {
        this.trainingPartnerName = trainingPartnerName;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }


}
