function getFileBlobType(event){
const imgInp = document.getElementById("imgInp")
const imgTag = document.getElementById("flower-img");
const [file] = imgInp.files
  if (file) {
    imgTag.src = URL.createObjectURL(file)
  }
}

function addFlower(){
    const name = document.getElementById("flower-name").value;
    const description = document.getElementById("flower-description").value;
    //const image = document.getElementById("flower-img").value;
console.log(image);
    const newFlower ={
    name:name,
    description:description,
    //image:image
    }

    $.ajax({
    url :"/flower/add",
    data: {
    newFlower
    },
    type : "POST",
    dataType : "json",
    success : function () {
    alert("You have successfully registered!")
    getUser ();
    window.location.reload()
    }
    })
}
