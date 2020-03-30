import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void namNhuan() {
        Boolean namNhuan = NextDayCalculator.namNhuan(2020);
        Boolean expected = true;
        assertEquals(true, namNhuan);
    }

    @Test
    void ngayTrongThang() {
        int ngayTrongThang = NextDayCalculator.ngayTrongThang(2, 2020);
        int expected = 29;
        assertEquals(expected, ngayTrongThang);
    }

    @Test
    void ngayTiepTheo() {
        String ngayTiepTheo = NextDayCalculator.ngayTiepTheo(29, 2, 2020);
        String expected = "1/3/2020";
        assertEquals(expected, ngayTiepTheo);
    }
}