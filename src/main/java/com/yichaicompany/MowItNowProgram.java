package com.yichaicompany;

public class MowItNowProgram {

    public static void main(String[] args) {
        String finalMowPosition = new MowItNowProgram().mow(0, 0, 'N');
        System.out.println(finalMowPosition);
        String finalMowPosition2 = new MowItNowProgram().mow(0, 0, 'N', 'A');
        System.out.println(finalMowPosition2);
        String finalMowPosition3 = new MowItNowProgram().mow(1, 0, 'N', 'A');
        System.out.println(finalMowPosition3);
    }

    public String mow(int initMowPosX,
                      int initMowPosY,
                      Character initMowOrientation,
                      Character... commands) {
        return String.valueOf(initMowPosX) + initMowPosY + initMowOrientation;
    }

}
