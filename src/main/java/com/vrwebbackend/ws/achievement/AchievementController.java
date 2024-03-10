package com.vrwebbackend.ws.achievement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/achievements")
public class AchievementController
{
    @Autowired
    AchievementService achievementService;

    @GetMapping("/unit1grade5achievement")
    public ResponseEntity<Object> getUnit1Grade5Achievement()
    {
        return achievementService.getUnit1Grade5Achievement();
    }

    @GetMapping("/unit2grade5achievement")
    public ResponseEntity<Object> getUnit2Grade5Achievement()
    {
        return achievementService.getUnit2Grade5Achievement();
    }

    @GetMapping("/unit3grade5achievement")
    public ResponseEntity<Object> getUnit3Grade5Achievement()
    {
        return achievementService.getUnit3Grade5Achievement();
    }

    @GetMapping("/unit4grade5achievement")
    public ResponseEntity<Object> getUnit4Grade5Achievement()
    {
        return achievementService.getUnit4Grade5Achievement();
    }

    @GetMapping("/unit5grade5achievement")
    public ResponseEntity<Object> getUnit5Grade5Achievement()
    {
        return achievementService.getUnit5Grade5Achievement();
    }

    @GetMapping("/unit6grade5achievement")
    public ResponseEntity<Object> getUnit6Grade5Achievement()
    {
        return achievementService.getUnit6Grade5Achievement();
    }

    @GetMapping("/unit7grade5achievement")
    public ResponseEntity<Object> getUnit7Grade5Achievement()
    {
        return achievementService.getUnit7Grade5Achievement();
    }

    @GetMapping("/unit1grade6achievement")
    public ResponseEntity<Object> getUnit1Grade6Achievement()
    {
        return achievementService.getUnit1Grade6Achievement();
    }

    @GetMapping("/unit2grade6achievement")
    public ResponseEntity<Object> getUnit2Grade6Achievement()
    {
        return achievementService.getUnit2Grade6Achievement();
    }

    @GetMapping("/unit3grade6achievement")
    public ResponseEntity<Object> getUnit3Grade6Achievement()
    {
        return achievementService.getUnit3Grade6Achievement();
    }

    @GetMapping("/unit4grade6achievement")
    public ResponseEntity<Object> getUnit4Grade6Achievement()
    {
        return achievementService.getUnit4Grade6Achievement();
    }

    @GetMapping("/unit5grade6achievement")
    public ResponseEntity<Object> getUnit5Grade6Achievement()
    {
        return achievementService.getUnit5Grade6Achievement();
    }

    @GetMapping("/unit6grade6achievement")
    public ResponseEntity<Object> getUnit6Grade6Achievement()
    {
        return achievementService.getUnit6Grade6Achievement();
    }

    @GetMapping("/unit7grade6achievement")
    public ResponseEntity<Object> getUnit7Grade6Achievement()
    {
        return achievementService.getUnit7Grade6Achievement();
    }

    @GetMapping("/unit1grade7achievement")
    public ResponseEntity<Object> getUnit1Grade7Achievement()
    {
        return achievementService.getUnit1Grade7Achievement();
    }
}
