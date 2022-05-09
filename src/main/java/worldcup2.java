/**
 * 월드컵
 * @since 2002  / 이것만 넣을수있음 이자리에는
 */
public class worldcup2 {

    /**
     * 기준년도 변수
     * @since 2022 / 여기도 since만 쓸 수 있음
     */
    private int since;
    /**
     * 월드컵 열린 년도 일치를 측정하는 메소드
     * @param year 확인용 년도
     * @return 4년주기 기준에 맞는지를 측정한 boolean결과값
     * @throws IllegalArgumentException 부적잘한 인수를 메소드로 넘겨줄 때 발생하는 예외
     * @since 2022
     */
    public boolean isWorldcupYear(int year) throws IllegalArgumentException{
        if(year < 1930){
            return false;
        }
        if(year == 1996 || year == 1978 || year == 1994 || year == 2018){
            return false;
        }
        if(year == 2022){
            return true;
        }
        if(2030 < year){
            throw new IllegalArgumentException(
                    "2030년까지만 지원합니다. 입력년도 : "+year);
        }return year % 4 == 0;
    }
}
