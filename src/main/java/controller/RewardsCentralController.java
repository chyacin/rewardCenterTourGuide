package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.RewardsCentralService;

import java.util.UUID;

@RestController
public class RewardsCentralController {
    @Autowired
    RewardsCentralService rewardsCentralService;


    @GetMapping("/attractionRewardPoints")
    public int getAttractionRewardPoints(@RequestParam UUID attractionId, UUID userId){
        int attractionRewardPoints = rewardsCentralService.getAttractionRewardPoints(attractionId, userId);
        return attractionRewardPoints;
    }


}
