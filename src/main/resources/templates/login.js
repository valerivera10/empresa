document.getElementById('loginForm').addEventListener('submit', function(event) {
  event.preventDefault();
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;
  // Aquí puedes agregar la lógica para autenticar al usuario
  // Por ejemplo, puedes hacer una solicitud AJAX a un servidor para verificar las credenciales
  // Si la autenticación es exitosa, puedes redirigir al usuario a la página principal
  // De lo contrario, puedes mostrar un mensaje de error
  alert('¡Hola ' + username + '!');
});