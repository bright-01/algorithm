package com.bright1.programmers.factoryPatternTest.exShip;

interface ShipFactory {

    default Ship orderShip(String email) {
        validate(email);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

     Ship createShip();

    private void validate(String email) {
        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }
    }

    private void sendEmailTo(String email, Ship ship){
        System.out.println("다 만들었다고 이메일 보냄");
    }
}
