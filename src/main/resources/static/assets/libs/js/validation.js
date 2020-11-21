
  function Validate() {
      var password = document.getElementById("pass1").value;
      var confirmPassword = document.getElementById("pass2").value;
      if (password != confirmPassword) {
          alert("Passwords do not match.");
          return false;
      }
      return true;
  }

/*
  (function () {
          'use strict';
          window.addEventListener('load', function () {
              var form = document.getElementById('needs-validation');
              form.addEventListener('submit', function (event) {
                  if (form.checkValidity() === false) {
                      event.preventDefault();
                      event.stopPropagation();
                  }
                  form.classList.add('was-validated');
              }, false);
          }, false);
  })();
*/

  (function() {
      'use strict';
      window.addEventListener('load', function() {
          // Fetch all the forms we want to apply custom Bootstrap validation styles to
          var forms = document.getElementsByClassName('needs-validation');
          // Loop over them and prevent submission
          var validation = Array.prototype.filter.call(forms, function(form) {
              form.addEventListener('submit', function(event) {
                  if (form.checkValidity() === false) {
                      event.preventDefault();
                      event.stopPropagation();
                  }
                  form.classList.add('was-validated');
              }, false);
          });
      }, false);
  })();