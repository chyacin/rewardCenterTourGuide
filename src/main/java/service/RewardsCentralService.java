package service;


import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardsCentralService {

    private final RewardCentral rewardCentral;

    public RewardsCentralService(RewardCentral rewardCentral) {
        this.rewardCentral = rewardCentral;
    }


    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        int attractionRewardPoints = rewardCentral.getAttractionRewardPoints(attractionId, userId);

        return attractionRewardPoints;
    }
}


