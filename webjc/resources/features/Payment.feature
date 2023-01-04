Feature: Pembayaran pesanan

 #TC1
    Scenario: User input username and password null
    When User go to Web
    And User pilih barang
		And User klik button Buy Now
		And User Input Kartu Pembayaran
		And user Klik button Pay
    Then User berhasil membayar