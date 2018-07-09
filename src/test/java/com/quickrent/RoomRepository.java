package quickRent.variableRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickRent.variable.Room;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Integer> {
    public List<Room> findByRentUser(Integer rentUser);
    public List<Room> findByPrice(Integer price);
}
