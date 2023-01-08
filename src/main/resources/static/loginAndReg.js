function register(){
const name = document.getElementById("uname").value;
const email = document.getElementById("email").value;
const password = document.getElementById("password").value;
const repeatedPassword = document.getElementById("psw-repeat").value;
  if (repeatedPassword !== password) {
    alert("password doesn't match");
  } else {
    const newUser = {
      name: name,
      email: email,
      password: password,
    };
    axios.post("http://localhost:8080/user/registration", newUser).then((response) => {
          window.location = "http://localhost:8080/myGarden.html";
      },
      (error) => alert(error)
    );
}
}

function login(){
const name = document.getElementById("uname").value;
const password = document.getElementById("psw").value;

axios
    .get(`http://localhost:8080/user/login?name=${name}&password=${password}`)
    .then((response) => {
      if (!response.data) {
        alert("Wrong password or username");
      } else {
        userId = response.data.id;
        userName = response.data.name
        localStorage.setItem("id", Number(userId));
        localStorage.setItem("name", userName);
        window.location = "http://localhost:8080/myGarden.html";
      }
    });
}