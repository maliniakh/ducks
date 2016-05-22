# ducks

mvn tomcat7:run

maven jax-rs archetype (cxf one)
      it comes with embedded tomcat 7 (as a plugin)
      some alternatives could be used like spring boot

in a real life codebase it might be worth creating separate modules for api and impl

i used maven 3.3 for this

in real life enterprise applications it would probably be worth introducing a service class that would be called from jax-rs implementation class
