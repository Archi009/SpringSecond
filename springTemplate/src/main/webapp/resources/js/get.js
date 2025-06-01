/**
 * 
 */

function read(){
  fetch('/board/20/replies')
    .then((response) => response.json())
    .then((json) => console.log(json));
  }


  function reg(data){
    fetch('/board/20/replies', {
    method: 'POST',
    body: JSON.stringify(data),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.json())
    .then((json) => console.log(json));
  }
  
  function mod(data){
	fetch('/board/20/replies',{
		method : 'PUT',
		body : JOSN.stringify(data),
		headers : {
			 'Content-type': 'application/json; charset=UTF-8',
		},
	})
	.then((response)=> response.json())
	.then((json)=> console.log(json))
		
  }
  
  function del(data){
	fetch('/board/20/replies',{
		method : 'DELETE',
		body : data,
		headers : {
			 'Content-type': 'application/json; charset=UTF-8',
		},
	})
		.then((res) => res.json())
		.then((json) => console.log(json))
  }