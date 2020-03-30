public class NextDayCalculator {
    public static boolean namNhuan(int nam) {
        boolean namNhuan = false;
        if (nam % 100 == 0) {
            if (nam % 400 == 0) {
                namNhuan = true;
            } else {
                namNhuan = false;
            }
        } else if (nam % 4 == 0) {
            namNhuan = true;
        }
        return namNhuan;
    }

    public static int ngayTrongThang(int thang, int nam) {

        int ngay = 0;
        if (thang < 1 || thang > 12)
            System.out.println(" Ban vua nhap ngay thang khong hop le ");
        else {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    ngay = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    ngay = 30;
                    break;
                }
                default: {
                    if (namNhuan(nam))
                        ngay = 29;
                    else
                        ngay = 28;
                    break;
                }
            }
        }
        return ngay;
    }

    public static String ngayTiepTheo(int ngay, int thang, int nam) {
        ngay = ngayTrongThang(thang, nam);
        if (ngay == -1 || ngay < 1 || ngay > ngay) {
            System.out.println("ngay hop le");
        } else {
            if (ngay < ngay)
                ngay++;
            else if (thang != 12) {
                ngay = 1;
                thang++;
            } else {
                ngay = thang = 1;
                nam++;
            }
        }
        return ngay + "/" + thang + "/" + nam;
    }
}
