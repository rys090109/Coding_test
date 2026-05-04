function solution(my_string) {
  let result = [];
  for (let i = 0; i < my_string.length; i++) {
    let code = my_string.charCodeAt(i);
    if (code >= 48 && code <= 57) { 
      result.push(code - 48);
    }
  }

  return result.sort((a, b) => a - b);
}