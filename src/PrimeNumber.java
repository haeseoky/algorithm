public class PrimeNumber {
    public PrimeNumber() {
        solution();
    }

    public void solution(){
        int min = 2;
        int max = 100000;
        // 100~500 까지 소수구하기
        Boolean [] data = new Boolean[max];

        for(int i=min; i<max; i++){
            data[i] = true;
        }

        for(int i=2; i<Math.sqrt(max);i++){
            for(int j = min; j*i<max;j++){
                data[j*i] = false;
            }
        }

        for(int i=min; i<max; i++){
            if(data[i] == true) {
                System.out.println(i + ":" + data[i] +":"+ isPrime(i));
            }
        }
    }

    public boolean isPrime(int N) {
        if (N < 2) return false;
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d)
            if (N % d == 0) return false;
        return true;
    }
}
