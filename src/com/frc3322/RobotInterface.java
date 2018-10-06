package com.frc3322;

public interface RobotInterface {

    String name = new String("Charles");

    void startCompetition();

    void robotInit();

    void autonomousInit();

    void teleopInit();

    void robotPeriodic();

    void autonomoousPeriod();

    void teleopPeriodic();

}

