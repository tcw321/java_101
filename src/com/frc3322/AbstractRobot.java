package com.frc3322;

public abstract class AbstractRobot {

    private String name = new String("Charles");

    public void startCompetition()
    {

    }

    public abstract void robotInit();

    public abstract void autonomousInit();

    public abstract void teleopInit();

    public abstract void robotPeriodic();

    public abstract void autonomoousPeriod();

    public abstract void teleopPeriodic();
}
