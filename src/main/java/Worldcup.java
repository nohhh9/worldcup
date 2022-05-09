public class Worldcup {
    public boolean isWorldcupYear(int year) throws IllegalArgumentException{
        if(year <1930){
            return false;
        }
        if(year == 1966 || year == 1978 || year == 1994 || year == 2018){
            return false;
        }
        if(year == 2022){
            return true;
        }
        if(2030 < year){
            throw new IllegalArgumentException(
                    "2030년까지만 지원합니다. 입력년도 : "+year);
        }
        return year%4 ==0;
    }
}
