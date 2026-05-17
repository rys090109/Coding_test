function solution(num, k) {
    let str = String(num);

    for(let i = 0; i < str.length; i++) {
        if(str.charAt(i) == k) {
            return i + 1;
        }
    }
    return -1;
}