package test;

import controller.TypeController;
import model.RoomType;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test class for TypeController
 */
public class TypeControllerTest {

    @Autowired
    private TypeController typeController;

    @Test
    public void testSaveType() {
        RoomType type = new RoomType();
        RoomType result = typeController.saveRoomType(type);
        Assert.assertEquals(type, result);
    }

    @Test
    public void testGetAllType() {
        RoomType type = new RoomType();
        RoomType result = typeController.saveRoomType(type);
        Assert.assertEquals(type, typeController.getAllRoomTypes());
    }

    @Test
    public void testGetTypeByID() {
        RoomType type = new RoomType();
        RoomType result = typeController.saveRoomType(type);
        Assert.assertEquals(result, typeController.getRoomTypeByID(result.getId()));
    }

    @Test
    public void testUpdateType() {
        RoomType type = new RoomType();
        RoomType result1 = typeController.saveRoomType(type);
        RoomType result2 = typeController.updateRoomType(type);
        Assert.assertEquals(result2, typeController.getRoomTypeByID(result2.getId()));
    }

    @Test
    public void testDeleteType() {
        RoomType type = new RoomType();
        RoomType mock = typeController.saveRoomType(type);
        int result = typeController.deleteRoomType(mock.getId());
        Assert.assertEquals(result, mock.getId());
    }
}
