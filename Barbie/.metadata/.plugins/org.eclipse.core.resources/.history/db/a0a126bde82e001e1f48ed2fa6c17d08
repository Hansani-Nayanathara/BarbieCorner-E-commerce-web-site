document.addEventListener('DOMContentLoaded', function() {
  const openPopupBtn = document.getElementById('open-popup');
  const closePopupBtn = document.getElementById('close-popup');
  const popupOverlay = document.getElementById('popup-overlay');

  openPopupBtn.addEventListener('click', function() {
    popupOverlay.style.display = 'block';
  });

  closePopupBtn.addEventListener('click', function() {
    popupOverlay.style.display = 'none';
  });
});

function validateLogin() {
  const email = document.getElementById("login-email").value;
  const password = document.getElementById("login-password").value;

  // Basic email and password validation
  if (!validateEmail(email)) {
    alert("Invalid email format. Please enter a valid email address.");
    return false;
  }

  if (password.length < 6) {
    alert("Password should be at least 6 characters long.");
    return false;
  }

  // Additional validation logic (e.g., authentication) can be added here

  return true;
}

function validateSignup() {
  const name = document.getElementById("signup-name").value;
  const email = document.getElementById("signup-email").value;
  const password = document.getElementById("signup-password").value;

  // Basic name, email, and password validation
  if (name.trim() === "") {
    alert("Name cannot be empty.");
    return false;
  }

  if (!validateEmail(email)) {
    alert("Invalid email format. Please enter a valid email address.");
    return false;
  }

  if (password.length < 6) {
    alert("Password should be at least 6 characters long.");
    return false;
  }

  // Additional validation logic (e.g., checking if email is already registered) can be added here

  return true;
}

function validateEmail(email) {
  // Regular expression for basic email validation
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return emailRegex.test(email);
}