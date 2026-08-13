# Java OOP Exercises (Bài tập thời sinh viên)

Tập hợp các bài tập Java làm trong quá trình học tại trường — giữ lại làm portfolio. Tất cả đã được biên dịch và chạy thử thành công (OpenJDK 11) trước khi đưa lên đây.

## Cấu trúc

```
java-oop-exercises/
├── btct-quan-ly-khach-tro/    # Bài tập OOP: kế thừa (inheritance)
│   └── src/btct/
│       ├── Nguoi.java          # Lớp cha: thông tin cá nhân cơ bản
│       ├── KhachSan.java       # Lớp con kế thừa Nguoi, thêm thông tin thuê phòng
│       └── BTCT.java           # Chương trình chính (main)
├── gui-calculator/             # Bài tập Swing GUI
│   └── src/gui/BT6.java        # Máy tính cộng/trừ/nhân/chia có giao diện
└── console-exercises/          # Các bài tập console nhỏ
    └── src/
        ├── btc2/BTC2.java      # Tính thứ trong tuần từ ngày/tháng/năm
        ├── bt11/BT11.java      # Nhập 2 số nguyên, tính tổng
        └── bt12/BT12.java      # Nhập chuỗi, in hoa/thường
```

## Ghi chú sửa lỗi

Hai file `BT11.java` và `BT12.java` trong bản gốc có lỗi khiến **không compile được** — đã sửa lại để chạy đúng, giữ nguyên yêu cầu đề bài:

- **BT11**: bản gốc gán kết quả `Scanner.nextLine()` (kiểu `String`) vào biến khai báo kiểu `int`, và dùng `System.out.println(...)` với nhiều tham số phân tách bằng dấu phẩy (cú pháp không hợp lệ trong Java). Đã sửa dùng `sc.nextInt()` và nối chuỗi bằng `+`.
- **BT12**: bản gốc khai báo kiểu `string` (chữ thường) — Java không có kiểu này, phải là `String`. Đã sửa lại đúng kiểu.

Các bài còn lại (`BTCT`/`KhachSan`/`Nguoi`, `BT6`, `BTC2`) giữ nguyên logic gốc, chỉ xác nhận lại là compile và chạy đúng.

## Cách chạy

Yêu cầu JDK 11 trở lên.

```bash
# Bài BTCT (nhieu file, co ke thua)
cd btct-quan-ly-khach-tro/src
javac btct/*.java && java btct.BTCT

# Bài console don gian (Java 11+, chay truc tiep tu source, khong can javac)
cd console-exercises/src/bt11 && java BT11.java
cd console-exercises/src/bt12 && java BT12.java
cd console-exercises/src/btc2 && java BTC2.java

# Bài GUI (can moi truong co man hinh, khong chay duoc qua SSH/headless)
cd gui-calculator/src && javac gui/BT6.java && java gui.BT6
```
