package com.frc3322;

import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTests {

    @Test
    public void interfaceRobot()
    {
        //InterfaceRobot robot = new InterfaceRobot();
        RobotFromInterface robot = new RobotFromInterface();
        assertTrue(robot.name.equals("Charles"));
    }

    @Test
    public void abstractRobot()
    {
        // AbstractRobot robot = new AbstractRobot();
        RobotFromAbstractClass robot = new RobotFromAbstractClass();
    }
}
