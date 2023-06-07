package com.bright1.programmers.factoryPatternTest.exShip;

public class NoCleanShip {
    String name, color, capacity;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    public static NoCleanShip orderShip(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("배이름을 지어주세요");
        }

        if (email == null) {
            throw new IllegalArgumentException("이메일을 남겨주세요");
        }

        NoCleanShip ship = new NoCleanShip();

        ship.name = name;

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.capacity = "20t";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.capacity = "15t";
        }

        if (name.equalsIgnoreCase("ContainerShip")) {
            ship.color = "green";
        } else if (name.equalsIgnoreCase("OilTankerShip")) {
            ship.color = "blue";
        }

        System.out.println(ship.name + " 다 만들었다고 " + email + "로 메일을 보냈습니다.");

        return ship;

    }
}
