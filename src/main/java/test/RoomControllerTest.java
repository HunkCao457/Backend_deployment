package test;

import controller.RoomController;
import model.Room;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test class for RoomController
 */
public class RoomControllerTest {

    @Autowired
    private RoomController roomController;

    @Test
    public void testSaveRoom() {}

    @Test
    public void testUpdateRoom() {}

    @Test
    public void testDeleteRoom() {
        Room room = new Room();
        Room mock = roomController.saveRoom(room);
        int result = roomController.deleteRoom(mock.getId());
        Assert.assertEquals(result, mock.getId());
    }

    @Test
    public void testGetAllRooms() {}

    @Test
    public void testGetRoomByID() {}

    @Test
    public void testGetRoomByWifi() {}

    @Test
    public void testGetRoomBySmoking() {}

    @Test
    public void testGetRoomByType() {

    }
}
