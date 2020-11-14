package pl.nauka;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(4);
        BuildingController controller = new BuildingController(building);
        controller.controlLoop();
    }
}