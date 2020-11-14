package pl.nauka;

public class BuildingController {
    private Building building;

    public BuildingController(Building building) {
        this.building = building;
    }
    public void controlLoop() {
        while(!building.areAllRoomsCool()) {
            System.out.println(building);
            building.coolRooms();
            sleepOneSecond();
        }
        System.out.println("Wszystkie pomieszczenia schłodzone do docelowej temperatury");
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
