angular.module('test').directive('myIsolatedScopeWithName', function () {
  return {
      scope: {
          name: '@'
      },
      template: 'Name: {{ name }}'
  };
});