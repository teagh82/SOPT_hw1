# SOPT_hw1
SOPT 1주차 과제

기본과제 1, 기본과제 2
(성장과제 1, 성장과제 2는 할 예정)

<기본과제 1>
ConstraintLayout을 이용하여 주어진 화면과 같이 만든다.
ConstraintDimentionRatio를 이용해서 이미지를 1:1 비율로 한다.
TextView에서 화면 끝까지 글이 가지않고 개행되도록 한다. --> Guideline 이용

ConstraintDimentionRatio을 이용하면 비율을 설정한대로 만들 수 있다.
layout_constraintDimensionRatio="width:height"는 width:height 비율로 할 수 있고 
문제에서 이미지를 1:1 비율로 만들라고 하였으므로 이 비율을 1:1로 해주면 된다.

글이 화면 끝까지 안가고 개행되도록 하려면 Guideline을 설정해서 이용하면 되는데 
이렇게 하면 Guideline까지만 글이 오고 다음 줄로 넘어가게 된다. 

<기본과제 2>
로그인 화면의 MainActivity와 회원가입 화면의 RegisterActivity를 만들었고
처음에 로그인 화면에서 아이디와 비밀번호 둘 중 하나라도 아무것도 입력하지 않았다면 토스트를 띄우기 위해
text.isNullOrBlank()을 이용해 Null인지 확인해주었다.
그리고 '회원가입하기' TextView를 클릭하면 RegisterActivity로 이동하게 했다.

RegisterActivity로 가면 '비밀번호'와 '비밀번호 확인'을 입력하는 부분의 문자열을 비교해서 둘이 다르다면 비밀번호를 다시 확인해달라는 토스트를 출력했다.
두 문자열이 같다면 회원가입을 했다는 것을 MainActivity에 알리기 위해 "check"라는 이름으로 1의 값을 putExtra를 통해 넣어주었고 사용자가 회원가입할 때 작성한 아이디와 비밀번호를 로그인 페이지에 나타내기 위해 "email"과 "password"라는 이름으로 각각의 EditText의 문자열을 가져와 저장했다.
그리고 MainActivity 화면을 보여준다.

다시 로그인 화면으로 가서 MainActivity를 보면 아까 RegisterActivity의 "check"의 값을 변수에 저장하고 그 변수의 값이 "1"이라면 회원가입할 때 작성한 아이디와 비밀번호를 로그인 화면에 나타내준다.
값을 가져올 때는 .getStringExtra("email")와 .getStringExtra("password")를 이용하고 텍스트를 넣을 때는 setText를 이용한다.

이번 과제를 통해 코틀린을 이용해서 다른 액티비티의 변수를 이용하는 법을 알게되었다. 
putExtra와 getStringExtra()를 이용해서 앞으로 더 많은 기능을 구현할 수 있을 것이라고 생각된다.
