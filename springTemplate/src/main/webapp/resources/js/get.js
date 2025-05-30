function read() { fetch('/board/1/replies?page=1')
  .then((response) => response.json())
  .then((json) => console.log(json));
  }

  function register(data) {
    fetch('/board/1/replies', {
  method: 'POST',
  body: JSON.stringify(data),
  headers: {
       'Content-Type': 'application/json; charset=UTF-8',
    },    
})
  .then((response) => response.json())
  .then((json) => console.log(json));
  }