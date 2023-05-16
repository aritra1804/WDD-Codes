var app = angular.module('calculatorApp', []);

app.controller('calculatorCtrl', function($scope) {
  $scope.display = '';
  $scope.num1 = null;
  $scope.num2 = null;
  $scope.operator = null;
  
  $scope.addNumber = function(num) {
    $scope.display += num.toString();
  };
  
  $scope.addOperator = function(op) {
    if ($scope.num1 === null) {
      $scope.num1 = Number($scope.display);
      $scope.operator = op;
      $scope.display = '';
    } else if ($scope.num2 === null) {
      $scope.num2 = Number($scope.display);
      $scope.calculate();
      $scope.num1 = $scope.result;
      $scope.operator = op;
      $scope.num2 = null;
      $scope.display = '';
    } else {
      $scope.calculate();
      $scope.num1 = $scope.result;
      $scope.operator = op;
      $scope.num2 = null;
      $scope.display = '';
    }
  };
  
  $scope.calculate = function() {
    $scope.num2 = Number($scope.display);
    switch ($scope.operator) {
      case '+':
        $scope.result = $scope.num1 + $scope.num2;
        break;
      case '-':
        $scope.result = $scope.num1 - $scope.num2;
        break;
      case '*':
        $scope.result = $scope.num1 * $scope.num2;
        break;
      case '/':
        $scope.result = $scope.num1 / $scope.num2;
        break;
    }
    $scope.display = $scope.result.toString();
  };
  
  $scope.clear = function() {
    $scope.display = '';
    $scope.num1 = null;
    $scope.num2 = null;
    $scope.operator = null;
  };
});