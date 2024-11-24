USE puppies_passion;

-- Add categories
INSERT INTO categories(id, name, url) VALUES (1, 'Bags','/images/categories/bags/dog-bags.jpg');
INSERT INTO categories(id, name, url) VALUES (2, 'Beds', '/images/categories/beds/dog-beds.jpg');
INSERT INTO categories(id, name, url) VALUES (3, 'Bowls', '/images/categories/bowls/dog-bowls.jpg');
INSERT INTO categories(id, name, url) VALUES (4, 'Clothes', '/images/categories/clothes/dog-clothes.jpg');
INSERT INTO categories(id, name, url) VALUES (5, 'Combs', '/images/categories/combs/dog-combs.jpg');
INSERT INTO categories(id, name, url) VALUES (6, 'Jewelry', '/images/categories/jewelry/dog-jewelry.jpg');
INSERT INTO categories(id, name, url) VALUES (7, 'Leashes', '/images/categories/leashes/dog-leashes.jpg');
INSERT INTO categories(id, name, url) VALUES (8, 'Toys', '/images/categories/toys/dog-toys.jpg');



-- Add user roles
INSERT INTO user_roles(id, user_role) VALUES (1, 'ADMIN');
INSERT INTO user_roles(id, user_role) VALUES (2, 'MODERATOR');
INSERT INTO user_roles(id, user_role) VALUES (3, 'CLIENT');



-- Add pictures for model-bag-1
INSERT INTO pictures (id, url) VALUES (1, '/images/categories/bags/model-bag-1/model-bag-1_1.jpg');
INSERT INTO pictures (id, url) VALUES (2, '/images/categories/bags/model-bag-1/model-bag-1_2.jpg');
INSERT INTO pictures (id, url) VALUES (3, '/images/categories/bags/model-bag-1/model-bag-1_3.jpg');
INSERT INTO pictures (id, url) VALUES (4, '/images/categories/bags/model-bag-1/model-bag-1_4.jpg');
INSERT INTO pictures (id, url) VALUES (5, '/images/categories/bags/model-bag-1/model-bag-1_5.jpg');
INSERT INTO pictures (id, url) VALUES (6, '/images/categories/bags/model-bag-1/model-bag-1_6.jpg');
INSERT INTO pictures (id, url) VALUES (7, '/images/categories/bags/model-bag-1/model-bag-1_7.jpg');

-- Add products
INSERT INTO products (id, name, description, category_id, available_quantity, quantity_sold) VALUES (1, 'Test_product1', 'Test_desc2', 1, 1000, 0);

-- Add product to category
INSERT INTO categories_products (category_id, products_id) VALUES (1, 1);

-- Add pictures to product
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 1);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 2);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 3);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 4);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 5);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 6);
INSERT INTO products_pictures (product_id, picture_id) VALUES (1, 7);



-- Add pictures for model-bag-2
INSERT INTO pictures (id, url) VALUES (8, '/images/categories/bags/model-bag-2/model-bag-2_1.jpg');
INSERT INTO pictures (id, url) VALUES (9, '/images/categories/bags/model-bag-2/model-bag-2_2.jpg');
INSERT INTO pictures (id, url) VALUES (10, '/images/categories/bags/model-bag-2/model-bag-2_3.jpg');
INSERT INTO pictures (id, url) VALUES (11, '/images/categories/bags/model-bag-2/model-bag-2_4.jpg');
INSERT INTO pictures (id, url) VALUES (12, '/images/categories/bags/model-bag-2/model-bag-2_5.jpg');
INSERT INTO pictures (id, url) VALUES (13, '/images/categories/bags/model-bag-2/model-bag-2_6.jpg');
INSERT INTO pictures (id, url) VALUES (14, '/images/categories/bags/model-bag-2/model-bag-2_7.jpg');

-- Add products
INSERT INTO products (id, name, description, category_id, available_quantity, quantity_sold) VALUES (2, 'Test_product2', 'Test_desc2', 1, 2000, 0);

-- Add product to category
INSERT INTO categories_products (category_id, products_id) VALUES (1, 2);

-- Add pictures to product
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 1);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 2);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 3);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 4);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 5);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 6);
INSERT INTO products_pictures (product_id, picture_id) VALUES (2, 7);



-- Add pictures for model-bag-3
INSERT INTO pictures (id, url) VALUES (15, '/images/categories/bags/model-bag-3/model-bag-3_1.jpg');
INSERT INTO pictures (id, url) VALUES (16, '/images/categories/bags/model-bag-3/model-bag-3_2.jpg');
INSERT INTO pictures (id, url) VALUES (17, '/images/categories/bags/model-bag-3/model-bag-3_3.jpg');
INSERT INTO pictures (id, url) VALUES (18, '/images/categories/bags/model-bag-3/model-bag-3_4.jpg');
INSERT INTO pictures (id, url) VALUES (19, '/images/categories/bags/model-bag-3/model-bag-3_5.jpg');
INSERT INTO pictures (id, url) VALUES (20, '/images/categories/bags/model-bag-3/model-bag-3_6.jpg');
INSERT INTO pictures (id, url) VALUES (21, '/images/categories/bags/model-bag-3/model-bag-3_7.jpg');

-- Add products
INSERT INTO products (id, name, description, category_id, available_quantity, quantity_sold) VALUES (3, 'Test_product3', 'Test_desc3', 1, 3000, 0);

-- Add product to category
INSERT INTO categories_products (category_id, products_id) VALUES (1, 3);

-- Add pictures to product
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 1);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 2);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 3);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 4);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 5);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 6);
INSERT INTO products_pictures (product_id, picture_id) VALUES (3, 7);



INSERT INTO users (id, username, email, password, first_name, last_name, gender, age, registration_date_time)
VALUES (1, 'admin', 'admin@admin.com', '', 'Admin', 'Admin', 'MALE', 20, LOCALTIME);

INSERT INTO roles_of_users (role_id, user_id) VALUES (1, 1);






