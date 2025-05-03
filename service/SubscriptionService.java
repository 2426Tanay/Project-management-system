package com.PMS.service;

import com.PMS.domain.PlanType;
import com.PMS.model.Subscription;
import com.PMS.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
