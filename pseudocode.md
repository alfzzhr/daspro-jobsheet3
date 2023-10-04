Algoritma: HargaBayar28

Deklarasi :
harga, jumlah, halaman             :int
dis, total, bayar, jmlDis, bsrDis  :double
merk                               :long

Deskripsi:
print "Masukan merk buku : "
read merk
print "Masukan jumlah halaman buku"
read halaman
print "Masukan harga barang yang dibeli"
read harga
print "Masukan jumlah jumlah barang yang dibeli"
read jumlah
print "Masukan besaran diskon (dalam desimal, contoh : 0.1 untuk 10%)"
read dis
total=harga*jumlah;
jmlDis=total*dis;
bayar=total-jmlDis;
print " Merk buku : "
read merk
print "Jumlah halaman :"
read halaman
print "Diskon yang anda dapatkan adalah"
print jmlDiskon
print "Jumlah yang harus dibayar adalah"
print bayar
