public class Model {
	
	String NamaRuang;
	String LokasiRuang;
	int Fakultas;
	int panjang;
	int lebar;
	int luas;
	int kursi;
	int pintu;
	int jendela;
	double rasio;
	int stopkontak;
	int kondisistopkontak;
	int posisistopkontak;
	int LCD;
	int kondisiLCD;
	int posisiLCD;
	int lampu;
	int kondisilampu;
	int posisilampu;
	int kipasangin;
	int kondisikipasangin;
	int posisikipasangin;
	int AC;
	int kondisiAC;
	int posisiAC;
	int CCTV;
	int kondisiCCTV;
	int posisiCCTV;
	int SSID;
	int bendwidth;
	int kondisilantai;
	int kondisijendela;
	int kondisidinding;
	int kondisiatap;
	int kondisipintu;
	int sirkulasiudara;
	int kelembapan;
	int pencahayaan;
	int suhu;
	int kebisingan;
	int bau;
	int kebocoran;
	int kerusakan;
	int keausan;
	int kekokohan;
	int kuncipintu;
	int bahaya;
	
	void setnamaruang (String namaruang){
		this.NamaRuang = namaruang;
	}

	String getnamaruang (){
		return this.NamaRuang;
	}
	
	void setlokasiruang (String lokasiruang){
		this.LokasiRuang = lokasiruang;
	}

	String getlokasiruang (){
		return this.LokasiRuang;
	}
	
	void setfakultas(int fakultas){
		this.Fakultas = fakultas;
	}
	
	int getfakultas (){
		return this.Fakultas;
	}
	
	void setpanjang(int Panjang){
		if (panjang <= 100){
			System.out.print("error");
		}else{
			this.panjang = Panjang;
		}
	}
	
	int getpanjang (){
		return this.panjang;
	}
	
	void setlebar(int Lebar){
		if (lebar <= 100){
			System.out.print("error");
		}else{
			this.lebar = Lebar;
		}
	}
	
	int getlebar (){
		return this.lebar;
	}
	
	void setkursi(int Kursi){
		if (kursi <= 200){
			System.out.print("error");
		}else{
			this.kursi = Kursi;
		}
	}
	
	int getkursi (){
		return this.kursi;
	}
	
	void setpintu(int Pintu){
		if (pintu <= 10){
			System.out.print("error");
		}else{
			this.pintu = Pintu;
		}
	}
	
	int getpintu (){
		return this.pintu;
	}
	
	void setjendela(int Jendela){
		if (jendela <= 20){
			System.out.print("error");
		}else{
			this.jendela = Jendela;
		}
	}
	
	int getjendela (){
		return this.jendela;
	}
	
	void setstopkontak(int Stopkontak){
		this.stopkontak = Stopkontak;
	}
	
	int getstopkontak (){
		return this.stopkontak;
	}
	
	void setkondisitopkontak(int KondisiStopkontak){
		this.kondisistopkontak = KondisiStopkontak;
	}
	
	int getkondisistopkontak (){
		return this.kondisistopkontak;
	}
	
	void setposisistopkontak(int PosisiStopkontak){
		this.posisistopkontak = PosisiStopkontak;
	}
	
	int getposisistopkontak (){
		return this.posisistopkontak;
	}
	
	void setLCD(int lcd){
		this.LCD = lcd;
	}
	
	int getLCD (){
		return this.LCD;
	}
	
	void setkondisiLCD(int Kondisilcd){
		this.kondisiLCD = Kondisilcd;
	}
	
	int getkondisiLCD (){
		return this.kondisiLCD;
	}
	
	void setposisiLCD(int Posisilcd){
		this.posisiLCD = Posisilcd;
	}
	
	int getposisiLCD (){
		return this.posisiLCD;
	}
	
	void setlampu(int Lampu){
		this.lampu = Lampu;
	}
	
	int getlampu (){
		return this.lampu;
	}
	
	void setkondisilampu(int Kondisilampu){
		this.kondisilampu = Kondisilampu;
	}
	
	int getkondisilampu (){
		return this.kondisilampu;
	}
	
	void setposisilampu(int Posisilampu){
		this.posisilampu = Posisilampu;
	}
	
	int getposisilampu (){
		return this.posisilampu;
	}
	
	void setkipasangin(int Kipasangin){
		this.kipasangin = Kipasangin;
	}
	
	int getkipasangin (){
		return this.kipasangin;
	}
	
	void setkondisikipasangin(int Kipasangin){
		this.kipasangin = Kipasangin;
	}
	
	int getkondisikipasangin (){
		return this.kondisikipasangin;
	}
	
	void setposisikipasangin(int Posisikipasangin){
		this.posisikipasangin = Posisikipasangin;
	}
	
	int getposisikipasangin (){
		return this.posisikipasangin;
	}
	
	void setAC(int ac){
		this.AC = ac;
	}
	
	int getAC (){
		return this.AC;
	}
	
	void setkondisiAC(int Kondisiac){
		this.kondisiAC = Kondisiac;
	}
	
	int getkondisiAC (){
		return this.kondisiAC;
	}
	
	void setposisiAC(int Posisiac){
		this.posisiAC = Posisiac;
	}
	
	int getposisiAC (){
		return this.posisiAC;
	}
	
	void setCCTV(int cctv){
		this.CCTV = cctv;
	}
	
	int getCCTV (){
		return this.CCTV;
	}
	
	void setkondisiCCTV(int kondisicctv){
		this.kondisiCCTV = kondisicctv;
	}
	
	int getkondisiCCTV (){
		return this.kondisiCCTV;
	}
	
	void setposisiCCTV(int Posisicctv){
		this.posisiCCTV = Posisicctv;
	}
	
	int getposisiCCTV (){
		return this.posisiCCTV;
	}
	
	void setSSID(int ssid){
		this.SSID = ssid;
	}
	
	int getSSID (){
		return this.SSID;
	}
	
	void setkondisilantai(int kondisilantai){
		this.kondisilantai = kondisilantai;
	}
	
	int getkondisilantai (){
		return this.kondisilantai;
	}
	
	void setkondisijendela(int kondisijendela){
		this.kondisijendela = kondisijendela;
	}
	
	int getkondisijendela (){
		return this.kondisijendela;
	}

	void setkondisidinding(int kondisidinding){
		this.kondisidinding = kondisidinding;
	}
	
	int getkondisidinding (){
		return this.kondisidinding;
	}
	
	void setkondisiatap(int kondisiatap){
		this.kondisiatap = kondisiatap;
	}
	
	int getkondisiatap (){
		return this.kondisiatap;
	}
	
	void setkondisipintu(int kondisipintu){
		this.kondisipintu = kondisipintu;
	}
	
	int getkondisipintu (){
		return this.kondisipintu;
	}
	
	void setsirkulasiudara (int sirkulasiudara){
		this.sirkulasiudara = sirkulasiudara;
	}
	
	int getsirkulasiudara (){
		return this.sirkulasiudara;
	}
	
	void setpencahayaan(int pencahayaan){
		this.pencahayaan = pencahayaan;
	}
	
	int getpencahayaan(){
		return this.pencahayaan;
	}
	
	void setkelembapan(int kelembapan){
		this.kelembapan = kelembapan;
	}
	
	int getkelembapan (){
		return this.kelembapan;
	}
	
	void setsuhu(int suhu){
		this.suhu = suhu;
	}
	
	int getsuhu (){
		return this.suhu;
	}
	
	void setkebisingan(int kebisingan){
		this.kebisingan= kebisingan;
	}
	
	int getkebisingan (){
		return this.kebisingan;
	}
	
	void setbau(int bau){
		this.bau = bau;
	}
	
	int getbau (){
		return this.bau;
	}
	
	void setkebocoran(int kebocoran){
		this.kebocoran = kebocoran;
	}
	
	int getkebocoran(){
		return this.kebocoran;
	}
	
	void setkerusakan(int kerusakan){
		this.kerusakan = kerusakan;
	}
	
	int getkerusakan(){
		return this.kerusakan;
	}
	
	void setkeausan(int keausan){
		this.keausan = keausan;
	}
	
	int getkeausan(){
		return this.keausan;
	}
	
	void setkekokohan(int kekokohan){
		this.kekokohan = kekokohan;
	}
	
	int getkekokohan(){
		return this.kekokohan;
	}
	
	void setkuncipintu(int kuncipintu){
		this.kuncipintu = kuncipintu;
	}
	
	int getkuncipintu(){
		return this.kuncipintu;
	}
	
	void setbahaya(int bahaya){
		this.bahaya = bahaya;
	}
	
	int getbahaya(){
		return this.bahaya;
	}
	
	int hitungluas(){
		luas = panjang*lebar;
		return luas;
	}
	
	double hitungrasioluas(){
		rasio = hitungluas()/kursi;
		return rasio;
	}
	
}