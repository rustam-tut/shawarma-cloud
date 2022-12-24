package sia.shawarmacloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.shawarmacloud.entity.ShawarmaOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<ShawarmaOrder, Long> {

    List<ShawarmaOrder> findByDeliveryZip(String deliveryZip);

    List<ShawarmaOrder> readOrderByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
}
