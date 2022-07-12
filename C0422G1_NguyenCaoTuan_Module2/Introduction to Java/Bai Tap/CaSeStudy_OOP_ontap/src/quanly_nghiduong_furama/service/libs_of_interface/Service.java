package on_tap_huongdoituong.quanly_nghiduong_furama.service.libs_of_interface;

import java.io.IOException;

public interface Service {
    void display() throws IOException;
    void addNew() throws IOException;
    void edit() throws IOException;

    void delete() throws IOException;

    void findByName();
}
