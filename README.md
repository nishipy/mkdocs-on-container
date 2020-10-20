# Sample MkDocs on docker
## Build a image
```
docker build . -t mkdocs
```

## Use a image
```
docker run --name mkdocs -d -p 8000:8000 mkdocs
```

## See documentation on your browser
```
http://localhost:8000
```

![](images/sampledoc.jpg)

## Testing
- Simple test by using curl.
  ```
  sh ./serve_test.sh 
  ```