package com.YJ.PMS.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private LocalDate subscriptionStartDate;
    private LocalDate getSubscriptionEndDate;

    private PlanType planType;
//    private boolean isValid;
    private  boolean isValid;
    @OneToOne
    private User user;

}
