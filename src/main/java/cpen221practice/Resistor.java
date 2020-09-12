package cpen221practice;

class Resistor {
    int colorCode(String color) {
        switch(color)
        {
            case "black":
                return 0;

            case "brown":
                return 1;

            case "red":
                return 2;

            case "orange":
                return 3;

            case "yellow":
                return 4;

            case "green":
                return 5;

            case "blue":
                return 6;

            case "violet":
                return 7;

            case "grey":
                return 8;

            case "white":
                return 9;
            default:
                return -1;
        }
    }

    String[] colors() {
        String[] array = new String[10];
        array[0] = "black";
        array[1] = "brown";
        array[2] = "red";
        array[3] = "orange";
        array[4] = "yellow";
        array[5] = "green";
        array[6] = "blue";
        array[7] = "violet";
        array[8] = "grey";
        array[9] = "white";

        return array;
    }
}
