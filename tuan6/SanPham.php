<?php
function ketnoiDB()
{
    return new mysqli('localhost','root','','apr');
}
function themSanPhamDB($MaSP,$TenSP,$DVT,$DonGia,$NCC)
{
    $con=ketnoiDB();
    $i=$con->query('INSERT INTO sanpham VALUES ("'.$MaSP.'","'.$TenSP.'","'.$DVT.'","'.$DonGia.'","'.$NCC.'")');
    return $i;
}
function hienThiSanPham()
{
    $con=ketnoiDB();
    $result=$con->query('SELECT * FROM SanPham');
    return $result;
}
function updateSanPhamDB($MaSP,$TenSP,$DVT,$DonGia,$NCC)
{
    $con=ketnoiDB();
    $i=$con->query('UPDATE SanPham SET TenSP=$TenSP, DVT=$DVT, DonGia=$DonGia, NCC=$NCC WHERE MaSP=$MaSP');
    return $i;
}
?>