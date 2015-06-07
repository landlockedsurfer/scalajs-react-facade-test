Simple test to create a ScalaJS React facade arround https://github.com/olahol/react-tagsinput

Run `sbt fastOptJS`

index.html uses Javascript to instantiate the `ReactTagsInput` component and is working fine.

index-with-sjs-react-facade.html uses a facade and fails with the error:
`Uncaught TypeError: Cannot read property '__reactAutoBindMap' of undefined`
in Chrome.

