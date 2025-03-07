package chapter3.enumm;

enum Direction {EAST, SOUTH, WEST, NORTH}



public class Main {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);
        System.out.println("========================");
        System.out.println("d1==d2 ? " + (d1 == d2));
        System.out.println("d1==d3 ? " + (d1 == d3));
        System.out.println("========================");
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
        System.out.println("========================");

        switch (d1) {
            case EAST:
                System.out.println(Direction.EAST);
                break;
            case WEST:
                System.out.println(Direction.WEST);
                break;
            case NORTH:
                System.out.println(Direction.NORTH);
                break;
            case SOUTH:
                System.out.println(Direction.SOUTH);
                break;
            default:
                System.out.println("invalid Direction");
                break;
        }
        Direction[] dArr = Direction.values();
        for(Direction d : dArr){
            System.out.printf("%s = %d%n", d.name(), d.ordinal());
        }


    }
}

